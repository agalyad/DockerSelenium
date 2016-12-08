#!/bin/sh

rm -rf downloads && mkdir downloads && chmod 777 downloads
docker-compose stop
docker-compose rm -f
#docker-compose scale seleniumnode=2
docker-compose run             \
        -u $UID:$UID            \
        -e HOME=/workspace       \
        seleniumserver            \
        bash -c 'bundle install --path .bundle && bundle exec $TASK'