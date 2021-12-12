diff --git a/src/java/net/sf/jabref/ImportFormatReader.java b/src/java/net/sf/jabref/ImportFormatReader.java
index 04937a3..218faaf 100644
--- a/src/java/net/sf/jabref/ImportFormatReader.java
+++ b/src/java/net/sf/jabref/ImportFormatReader.java
@@ -559,7 +559,7 @@
 			EndPage=val;
 			    
 		    else if(lab.equals("VL")) hm.put("volume",val);
-		    else if(lab.equals("N2")) hm.put("abstract",val);
+		    else if(lab.equals("N2") || lab.equals("AB")) hm.put("abstract",val);
 		    else if(lab.equals("UR")) hm.put("url",val);
 		    else if((lab.equals("Y1")||lab.equals("PY"))&& val.length()>=4)
 			hm.put("year",val.substring(0,4));
