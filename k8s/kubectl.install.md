# Install cubectl install
[cubectl install web site](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

1. Download latest release
```bash
$ curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
```

2. Make it executable
```bash
$ chmod +x ./kubectl
```

3. Copy or move to /usr/local/bin
```bash
$ sudo mv ./kubectl /usr/local/bin/kubectl
```

4. Verify installation
```bash
$ kubectl cluster-info
```

5. Enable autocompletion
```bash
$ echo "source <(kubectl completion bash)" >> ~/.bashrc
```