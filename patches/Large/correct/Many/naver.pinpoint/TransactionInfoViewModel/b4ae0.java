diff --git a/web/src/main/java/com/navercorp/pinpoint/web/view/TransactionInfoViewModel.java b/web/src/main/java/com/navercorp/pinpoint/web/view/TransactionInfoViewModel.java
index 1cfd029..6981c91 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/view/TransactionInfoViewModel.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/view/TransactionInfoViewModel.java
@@ -94,7 +94,7 @@
 
     @JsonProperty("logPageUrl")
     public String getLogPageUrl() {
-        if (logPageUrl != null || logPageUrl.length() > 0) {
+        if (logPageUrl != null && logPageUrl.length() > 0) {
             try {
                 URL url = new URL(logPageUrl);
                 StringBuilder sb = new StringBuilder();
