diff --git a/test/core/src/lombok/RunTestsViaDelombok.java b/test/core/src/lombok/RunTestsViaDelombok.java
index 59a0ee8..bcaa66a 100644
--- a/test/core/src/lombok/RunTestsViaDelombok.java
+++ b/test/core/src/lombok/RunTestsViaDelombok.java
@@ -45,7 +45,9 @@
 		delombok.setDiagnosticsListener(new DiagnosticListener<JavaFileObject>() {
 			@Override public void report(Diagnostic<? extends JavaFileObject> d) {
 				String msg = d.getMessage(Locale.ENGLISH);
-				Matcher m = Pattern.compile("^" + Pattern.quote(file.getAbsolutePath()) + "\\s*:\\s*\\d+\\s*:\\s*(?:warning:\\s*)?(.*)$").matcher(msg);
+				Matcher m = Pattern.compile(
+						"^" + Pattern.quote(file.getAbsolutePath()) +
+						"\\s*:\\s*\\d+\\s*:\\s*(?:warning:\\s*)?(.*)$", Pattern.DOTALL).matcher(msg);
 				if (m.matches()) msg = m.group(1);
 				messages.append(String.format("%d:%d %s %s\n", d.getLineNumber(), d.getColumnNumber(), d.getKind(), msg));
 			}
