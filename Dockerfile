# Pull base image
FROM ubuntu:14.04

# Install java 8
RUN \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  apt-get update && \
  apt-get install -y software-properties-common && \
  apt-get install -y python-software-properties && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer


# Define JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Install selenium
#RUN mkdir ~/selenium
#RUN cd ~/selenium
RUN wget http://selenium-release.storage.googleapis.com/2.53/selenium-server-standalone-2.53.1.jar

# Install Firefox
RUN wget http://ftp.mozilla.org/pub/mozilla.org/firefox/releases/48.0.2/linux-i686/en-US/firefox-48.0.2.tar.bz2
RUN tar xvjf firefox-48.0.2.tar.bz2
RUN ln -s /firefox /usr/bin/firefox


# Starting up Selenium server
#RUN java -jar ~/selenium/selenium-server-standalone-2.53.1.jar
RUN java -jar selenium-server-standalone-2.53.1.jar

# Define default command.
CMD ["bash"]