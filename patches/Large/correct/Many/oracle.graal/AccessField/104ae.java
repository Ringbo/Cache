diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/ir/AccessField.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/ir/AccessField.java
index df896e9..8f42ed8 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/ir/AccessField.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/ir/AccessField.java
@@ -76,7 +76,7 @@
         this.field = field;
         setObject(object);
         assert field.isResolved();
-        assert field.holder().isResolved();
+        assert field.holder().isInitialized();
     }
 
     /**
