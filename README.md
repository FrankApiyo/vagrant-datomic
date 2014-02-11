# Vagrant Datomic

This playbook will boot up a Datomic server locally using Vagrant. It can also be deployed to a cloud server by changing the hosts file

## Getting started

You first need to boot up Vagrant and provision the server using Ansible.

Assuming you have those already installed:

Boot the Vagrant VM and provision it

```
# Start a Vagrant instance
vagrant up
# Run the playbook
./deploy.sh
```

## On the VM

At the moment you need to manually start the database (sorry upstart config not finished!)

```
vagrant ssh
sudo transactor /var/lib/datomic/transactor.properties
```

Datomic has been added to the path so you can run the Datomic shell

```
vagrant ssh
shell
```

Start the transactor

```
sudo transactor /var/lib/datomic/transactor.properties
```

## TODO

+ Finish upstart config
