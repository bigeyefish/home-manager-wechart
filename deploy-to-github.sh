#!/bin/bash

set -o errexit -o nounset
if [ "$TRAVIS_BRANCH" != "master" ]
then
  echo "This commit was made against the $TRAVIS_BRANCH and not the master! No deploy!"
  exit 0
fi

rev=$(git rev-parse --short HEAD)

cd ./target

git init
git config user.name "bigeyefish"
git config user.email "$EMAIL_HOST"

git remote add upstream "https://$GH_TOKEN@github.com/bigeyefish/deploy_package.git"
git fetch upstream
git reset upstream/master

echo "honeypotato.com" > CNAME


git add *.jar
git commit -m "rebuild at ${rev}"
git push -q upstream HEAD:master
