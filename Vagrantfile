VAGRANT_VERSION = "2"

Vagrant.configure(VAGRANT_VERSION) do |config|
  config.vm.box        = 'precise64'
  # config.vm.box_url  = 'http://files.vagrantup.com/precise64.box'
  config.vm.box_url    = 'http://cloud-images.ubuntu.com/vagrant/trusty/current/trusty-server-cloudimg-amd64-vagrant-disk1.box'
  config.vm.hostname   = 'datomic'
  config.vm.network :private_network, ip: "33.33.33.33"
  config.vm.provider :virtualbox do |vb|
    vb.customize ["modifyvm", :id, "--memory", 2048]
  end
end