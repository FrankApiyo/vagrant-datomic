# Vagrant Datomic

This playbook will boot up a Datomic server locally using Vagrant. It can also be deployed to a cloud server by changing the hosts file

It's worth noting that Datomic is a total nightmare to automate the install for now because to download 
the db you need to go to the website and login. 

For now I've put the database on dropbox which makes an install easier. So be aware that if you change the version in roles/datomic/vars you will need to update the download URL yourself.

So in roles/datomic/tasks/main.yml update the following line to a URL where you can wget the package!

```yaml
- name: Download datomic
  get_url: url=https://dl.dropboxusercontent.com/u/6475135/datomic-free-{{ datomic_version }}.zip
           dest={{ datomic_dir }}
  when: datomic_exists|failed
```

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
