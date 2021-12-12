diff --git a/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java b/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
index e436648..f1b9a3c 100644
--- a/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
+++ b/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
@@ -112,7 +112,7 @@
 	}
 	public void setRequestUrlRegex(String requestUrlregex) {
 		this.requestUrlRegex = requestUrlregex;
-		if (requestUrlregex == null) {
+		if (requestUrlregex == null || requestUrlregex.length() == 0) {
 			this.requestUrlPattern = null;
 		} else {
 			this.requestUrlPattern = Pattern.compile(requestUrlregex, PATTERN_SCAN);
@@ -123,7 +123,7 @@
 	}
 	public void setRequestHeaderRegex(String requestHeaderRegex) {
 		this.requestHeaderRegex = requestHeaderRegex;
-		if (requestHeaderRegex == null) {
+		if (requestHeaderRegex == null || requestHeaderRegex.length() == 0) {
 			this.requestHeaderPattern = null;
 		} else {
 			this.requestHeaderPattern = Pattern.compile(requestHeaderRegex, PATTERN_SCAN);
@@ -134,7 +134,7 @@
 	}
 	public void setResponseHeaderRegex(String responseHeaderRegex) {
 		this.responseHeaderRegex = responseHeaderRegex;
-		if (responseHeaderRegex == null) {
+		if (responseHeaderRegex == null || responseHeaderRegex.length() == 0) {
 			this.responseHeaderPattern = null;
 		} else {
 			this.responseHeaderPattern = Pattern.compile(responseHeaderRegex, PATTERN_SCAN);
@@ -145,7 +145,7 @@
 	}
 	public void setResponseBodyRegex(String responseBodyRegex) {
 		this.responseBodyRegex = responseBodyRegex;
-		if (responseBodyRegex == null) {
+		if (responseBodyRegex == null || responseBodyRegex.length() == 0) {
 			this.responseBodyPattern = null;
 		} else {
 			this.responseBodyPattern = Pattern.compile(responseBodyRegex, PATTERN_SCAN);
