diff --git a/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java b/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
index b911f35..ee2f397 100644
--- a/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
+++ b/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
@@ -511,7 +511,7 @@
             for (int i = 0; i < resultTypes.length; i++) {
                 ret.outputs[i] = new Param();
                 ret.outputs[i].name = "res" + i;
-                ret.outputs[i].type = Type.getType(paramTypes[i]);
+                ret.outputs[i].type = Type.getType(resultTypes[i]);
             }
             return ret;
         }
