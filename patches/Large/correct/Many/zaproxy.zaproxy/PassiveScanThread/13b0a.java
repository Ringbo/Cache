diff --git a/src/org/zaproxy/zap/extension/pscan/PassiveScanThread.java b/src/org/zaproxy/zap/extension/pscan/PassiveScanThread.java
index 633dfe6..1be4f17 100644
--- a/src/org/zaproxy/zap/extension/pscan/PassiveScanThread.java
+++ b/src/org/zaproxy/zap/extension/pscan/PassiveScanThread.java
@@ -124,12 +124,13 @@
 										scanner.scanHttpResponseReceive(msg, href.getHistoryId(), src);
 									}
 								}
-							} catch (Exception e) {
+							} catch (Throwable e) {
 								if (shutDown) {
 									return;
 								}
 								logger.error("Scanner " + scanner.getName() + 
-										" failed on record " + currentId + " from History table", e);
+										" failed on record " + currentId + " from History table: "
+										+ href.getMethod() + " " + href.getURI(), e);
 							}
 						}
 					} catch (Exception e) {
