# Java

This playbook installs Oracles Java rather than the OpenJDK version

## Getting started

You first need to boot up Vagrant and provision the server using Ansible. Assuming you have those already installed:

Boot the Vagrant VM and provision it

```
vagrant up && ./deploy.sh
```

## On the VM

Datomic has been added to the path so you can run the Datomic shell

```
vagrant ssh
shell
```

Or start the transactor

```
sudo transactor /var/lib/datomic/transactor.properties
```
