package project.dlink.sshclient;

public interface SshClientService {
	int ALL_CLIENTS_OPERATION_INDEX = -1;

    void printDevices();
    void getController(int index);
    void setController(int index, String ip, String port);
    void unsetController(int index, String ip);
    void getFlows(int index);
    void getGroups(int index);
    void getLogs(int index, String filename);
    void execCommand(int index, String cmd);
    void setSsid(int index, String ifname, String ssid);

    void setVxlanSourceInterfaceLoopback(int index, String loopbackId);
    void setVxlanVlan(int index, String vnid, String vid);
    void setVxlanVtep(int index, String vnid, String ip, String mac);
}
