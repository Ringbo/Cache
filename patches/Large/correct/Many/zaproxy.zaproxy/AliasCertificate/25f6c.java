diff --git a/src/ch/csnc/extension/httpclient/AliasCertificate.java b/src/ch/csnc/extension/httpclient/AliasCertificate.java
index f6bfb0c..b56041f 100644
--- a/src/ch/csnc/extension/httpclient/AliasCertificate.java
+++ b/src/ch/csnc/extension/httpclient/AliasCertificate.java
@@ -59,7 +59,7 @@
 		
 		String cn = getCN();
 		
-		if(cn.length() == 0){
+		if(cn == null || cn.length() == 0){
 			return getAlias();
 		}else{
 			return cn + " ["+getAlias()+"]";
