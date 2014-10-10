# -*- mode: ruby -*-
# vi: set ft=ruby :
# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"


$script = <<PROVISION
sudo sh -c "wget -qO- https://get.docker.io/gpg | apt-key add -"
sudo sh -c "echo deb http://get.docker.io/ubuntu docker main\ > /etc/apt/sources.list.d/docker.list"
sudo apt-get update
sudo apt-get install --assume-yes --force-yes lxc-docker vim tmux
sudo usermod -a -G docker vagrant
PROVISION

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  # Note: If you would like to use a custom box you can grab them from https://www.vagrantbox.es, or https://vagrantcloud.com
  config.vm.box = "ubuntu/trusty64"

  config.vm.provision "shell", inline: $script
  config.vm.network :private_network, ip: "192.168.53.100"
  config.vm.provider :virtualbox do |v|
    v.memory = 2048
    v.cpus = 4
  end
end
