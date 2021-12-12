diff --git a/javamelody-core/src/main/java/net/bull/javamelody/ProcessInformations.java b/javamelody-core/src/main/java/net/bull/javamelody/ProcessInformations.java
index 5a358ba..f6c6b51 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/ProcessInformations.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/ProcessInformations.java
@@ -61,7 +61,7 @@
 	private final String cpuTime;
 	private final String command;
 
-	private ProcessInformations(Scanner sc, boolean windows) {
+	private ProcessInformations(Scanner sc, boolean windows, boolean macOrAix) {
 		super();
 		if (windows) {
 			final StringBuilder imageNameBuilder = new StringBuilder(sc.next());
@@ -102,7 +102,7 @@
 			rss = sc.nextInt();
 			tty = sc.next();
 			stat = sc.next();
-			if (sc.hasNextInt()) {
+			if (macOrAix && sc.hasNextInt()) {
 				start = sc.next() + ' ' + sc.next();
 			} else {
 				start = sc.next();
@@ -112,7 +112,8 @@
 		}
 	}
 
-	static List<ProcessInformations> buildProcessInformations(InputStream in, boolean windows) {
+	static List<ProcessInformations> buildProcessInformations(InputStream in, boolean windows,
+			boolean macOrAix) {
 		final String charset;
 		if (windows) {
 			charset = "Cp1252";
@@ -130,7 +131,7 @@
 
 		final List<ProcessInformations> processInfos = new ArrayList<ProcessInformations>();
 		while (sc.hasNext()) {
-			final ProcessInformations processInfo = new ProcessInformations(sc, windows);
+			final ProcessInformations processInfo = new ProcessInformations(sc, windows, macOrAix);
 			processInfos.add(processInfo);
 		}
 		return Collections.unmodifiableList(processInfos);
@@ -154,7 +155,7 @@
 				// (http://mindprod.com/jgloss/properties.html) qui acceptent la commande ps
 				process = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "ps wauxf" });
 			}
-			return buildProcessInformations(process.getInputStream(), windows);
+			return buildProcessInformations(process.getInputStream(), windows, mac || aix);
 		} finally {
 			if (process != null) {
 				// évitons http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6462165
