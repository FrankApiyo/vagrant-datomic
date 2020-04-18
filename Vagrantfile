VAGRANT_VERSION = "2"

Vagrant.configure(VAGRANT_VERSION) do |config|
  config.vm.box = "hashicorp/precise64"
  config.vm.hostname   = 'datomic'
  config.vm.network :private_network, ip: "33.33.33.33"
  config.vm.provider :virtualbox do |vb|
    vb.customize ["modifyvm", :id, "--memory", 2048]
  end
end