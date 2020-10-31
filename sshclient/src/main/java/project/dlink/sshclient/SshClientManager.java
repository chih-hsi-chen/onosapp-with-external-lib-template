package project.dlink.sshclient;

public class SshClientManager implements SshClientService {
	@Override
	public void printDevices() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getController(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setController(int index, String ip, String port) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unsetController(int index, String ip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getFlows(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getGroups(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getLogs(int index, String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execCommand(int index, String cmd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSsid(int index, String ifname, String ssid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVxlanSourceInterfaceLoopback(int index, String loopbackId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVxlanVlan(int index, String vnid, String vid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVxlanVtep(int index, String vnid, String ip, String mac) {
		// TODO Auto-generated method stub

	}

	public String returnTest() {
		return "Za Warudo!!!";
	}

}
