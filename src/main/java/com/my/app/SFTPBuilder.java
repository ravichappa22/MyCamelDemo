package com.my.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SFTPBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//C:\Users\ravi.chappa\Documents\Ravi\Projects\Amazon\raviamazon.ppk
		/*from("file:C:\\inputdir\\one?delete=true&consumer.delay=10000&consumer.initialDelay=5000").to("sftp://ec2-user@ec2-34-213-213-197.us-west-2.compute.amazonaws.com/sftp?"
				+ "privateKeyUri=raviamazon.ppk&preferredAuthentications=publickey&knownHostsFile=C://Users/ravi.chappa/.ssh/known_hosts");
		*/
		//demo.wftpserver.com
		from("file:C:\\inputdir\\one?delete=true&consumer.delay=10000&consumer.initialDelay=5000")
		     .to("ftps://demo-user@demo.wftpserver.com:990/upload?password=demo-user"
		     		+ "&securityProtocol=SSL&isImplicit=true"
		     		+ "&ftpClient.keyStore.file=C:\\Ravi\\Projects\\WorkSpaces\\Own\\JenkinsDemos\\MyCamelDemo\\src\\main\\java\\com\\my\\app\\jssecacerts"
		     		+ "&ftpClient.keyStore.password=changeit"
		     		+ "&ftpClient.keyStore.keyPassword=changeit"
		     		);
	}

}
