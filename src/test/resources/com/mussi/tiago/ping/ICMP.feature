Feature: Ping hosts with ICMP protocol

	Scenario: Ping a single host with success

		Given hosts
			| www.google.com |
		And delay "5" seconds
		And ping command "ping -n 1"
		When ping hosts
		# not sure about the result
		Then should return ping ICMP result statistics "Pacotes: Enviados = 1, Recebidos = 1, Perdidos = 0 (0% de perda)"