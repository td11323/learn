# Install kubelet & kubeadm on linux Ubuntu 16.04
```bash
$ sudo -i
$ curl -s https://packages.cloud.google.com/apt/doc/apt-key.gpg | apt-key add -
$ cat <<EOF >/etc/apt/sources.list.d/kubernetes.list
deb http://apt.kubernetes.io/ kubernetes-xenial main
EOF
$ apt-get update
apt-get install -y kubelet kubeadm
```