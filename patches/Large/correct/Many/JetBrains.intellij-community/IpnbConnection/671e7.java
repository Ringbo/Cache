diff --git a/python/ipnb/src/org/jetbrains/plugins/ipnb/protocol/IpnbConnection.java b/python/ipnb/src/org/jetbrains/plugins/ipnb/protocol/IpnbConnection.java
index b5e1b94..0232bfe 100644
--- a/python/ipnb/src/org/jetbrains/plugins/ipnb/protocol/IpnbConnection.java
+++ b/python/ipnb/src/org/jetbrains/plugins/ipnb/protocol/IpnbConnection.java
@@ -311,14 +311,14 @@
     }
   }
 
-  private void addCellOutput(@NotNull final PyContent content, ArrayList<IpnbOutputCell> output) {
+  private static void addCellOutput(@NotNull final PyContent content, ArrayList<IpnbOutputCell> output) {
     if (content instanceof PyErrContent) {
       output.add(new IpnbErrorOutputCell(((PyErrContent)content).getEvalue(),
                                  ((PyErrContent)content).getEname(), ((PyErrContent)content).getTraceback(), null));
     }
     else if (content instanceof PyStreamContent) {
       final String data = ((PyStreamContent)content).getData();
-      output.add(new IpnbStreamOutputCell(data, new String[]{data}, null));
+      output.add(new IpnbStreamOutputCell(((PyStreamContent)content).getName(), new String[]{data}, null));
     }
     else if (content instanceof PyOutContent) {
       final Map<String, String> data = ((PyOutContent)content).getData();
