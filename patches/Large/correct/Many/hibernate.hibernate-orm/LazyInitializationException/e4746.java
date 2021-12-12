diff --git a/hibernate-core/src/main/java/org/hibernate/LazyInitializationException.java b/hibernate-core/src/main/java/org/hibernate/LazyInitializationException.java
index b2f1436..31ea1ce 100644
--- a/hibernate-core/src/main/java/org/hibernate/LazyInitializationException.java
+++ b/hibernate-core/src/main/java/org/hibernate/LazyInitializationException.java
@@ -43,7 +43,7 @@
 
 	public LazyInitializationException(String msg) {
 		super(msg);
-        LOG.error(msg, this);
+        LOG.trace(msg, this);
 	}
 
 }
