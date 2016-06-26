/**
 * 
 */
package com.spring.aop.cala;

/**
 * @author zhaocc
 *
 */
public class ArchTest {
	public static void main(String[] args) {
		// testBasePoxy();
		// testBasePoxyLoginfo();
		testBaseVaditPoxyLoginfo();
	}

	public static void testBasePoxy() {

		IArch archImpl = new ArchImpl();

		ArchImplProxyLog proxyLog = new ArchImplProxyLog(archImpl);

		IArch iArchProxyLogging = proxyLog.getIArchProxyLogging();
		System.out.println(iArchProxyLogging.add(3, 4));
		System.out.println(iArchProxyLogging.sub(3, 4));
		System.out.println(iArchProxyLogging.div(3, 4));
		System.out.println(iArchProxyLogging.mul(3, 4));
	}

	public static void testBasePoxyLoginfo() {

		ArchimlImplProxyLog<IArch> log = new ArchimlImplProxyLog<IArch>(new ArchImpl());
		IArch proxyinit = log.getProxyinit(new ArchImpl());
		System.out.println(proxyinit.add(3, 4));
		System.out.println(proxyinit.sub(3, 4));
		System.out.println(proxyinit.div(3, 4));
		System.out.println(proxyinit.mul(3, 4));
	}

	public static void testBaseVaditPoxyLoginfo() {

		ArchimplVaidatProxyLog<IArch> log = new ArchimplVaidatProxyLog<IArch>(new ArchImpl());
		IArch proxyinit = log.getProxyinit(new ArchImpl());
		System.out.println(proxyinit.add(3, 5));
		System.out.println(proxyinit.sub(3, 4));
		System.out.println(proxyinit.div(3, 4));
		System.out.println(proxyinit.mul(3, 4));
	}

}
