# Vagrant Datomic

TODO install the console app https://dl.dropboxusercontent.com/u/6475135/datomic-console-0.1.170%20%281%29.zip

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

That's all you need to do. Datomic will automatically startup when you boot the VM.

See the examples directory showing you how to connect to this Vagrant datomic instance using Clojure.

## Access the VM

```
vagrant ssh
```

Datomic has been added to the path so you can run the Datomic shell

```
shell
```

Start the transactor

```
sudo transactor /var/lib/datomic/transactor.properties
```

Datomic is running as a service on the Vagrant vm. E.g

```
sudo service datomic start
sudo service datomic restart
sudo service datomic stop
```
