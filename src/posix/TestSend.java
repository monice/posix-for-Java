package posix;

import java.io.IOException;

public class TestSend {
	public static void main(String[] args) throws IPCException, IOException {
		int keyval = 1;
		String str = "1";
		/*if ((qid = MsgQ.msgget(keyval, IPC.IPC_CREAT | 0660)) == -1) {
			System.out.println(-1);
		}*/
		MsgQ mq = new MsgQ(keyval, IPC.IPC_CREAT | 0660);
		int qid = mq.send(keyval, str.getBytes(), str.length(), 0);
		System.out.println(qid);
		// LoadLibrary.loadPosix();
	}
}
