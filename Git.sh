#!/bin/bash

git status
git add -A
echo Enter Message for Commit...
read -p 'Message: ' message
git commit -m "$message"
git push origin master
