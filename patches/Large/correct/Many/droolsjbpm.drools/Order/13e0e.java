diff --git a/drools-compiler/src/test/java/org/drools/Order.java b/drools-compiler/src/test/java/org/drools/Order.java
index 3c2fe0c..da7ef64 100755
--- a/drools-compiler/src/test/java/org/drools/Order.java
+++ b/drools-compiler/src/test/java/org/drools/Order.java
@@ -71,7 +71,7 @@
     }
     
     public void addItem( OrderItem item ) {
-        this.items.put( new Long( item.getSeq() ), item );
+        this.items.put( new Integer( item.getSeq() ), item );
     }
 
     /* (non-Javadoc)
