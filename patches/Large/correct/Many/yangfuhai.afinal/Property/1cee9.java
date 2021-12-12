diff --git a/src/net/tsz/afinal/db/table/Property.java b/src/net/tsz/afinal/db/table/Property.java
index 2fc2b08..1ee7f64 100644
--- a/src/net/tsz/afinal/db/table/Property.java
+++ b/src/net/tsz/afinal/db/table/Property.java
@@ -40,7 +40,7 @@
 	private Method set;
 	
 	public void setValue(Object receiver , Object value){
-		if(set!=null){
+		if(set!=null && value!=null){
 			try {
 				if (dataType == String.class) {
 					set.invoke(receiver, value.toString());
