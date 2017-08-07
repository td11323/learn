# Install docker ce in Ubuntu
1. update apt in linux
```bash
$ sudo apt-get update
```

2. Install packages to use https
```bash
$ sudo apt-get install apt-transport-https
$ sudo apt-get install ca-certificates
$ sudo apt-get install curl
$ sudo apt-get isntall software-properties-common
```

3. Add Docker’s official GPG key
```bash
$ curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
$ sudo apt-key fingerprint 0EBFCD88
```

4. Setup stable respository
```bash
$ sudo add-apt-repository deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
```

5. Install docker CE
```bash
$ sudo apt-get update
$ sudo apt-get install docker-ce
```

6. Verify install
```bash
sudo docker run hello-world
```

[Docker CE install web site](https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/#install-using-the-repository)