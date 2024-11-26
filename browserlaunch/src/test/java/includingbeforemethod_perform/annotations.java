package includingbeforemethod_perform;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {

	@BeforeMethod
	public void name() {
		System.out.println("kijnj");
	}

	@Test
	public void output() {
		System.out.println("sdfghj");
	}
}
