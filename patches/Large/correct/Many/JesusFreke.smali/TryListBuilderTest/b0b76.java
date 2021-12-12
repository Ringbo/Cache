diff --git a/src/test/java/TryListBuilderTest.java b/src/test/java/TryListBuilderTest.java
index e937fb6..29c6d2f 100644
--- a/src/test/java/TryListBuilderTest.java
+++ b/src/test/java/TryListBuilderTest.java
@@ -70,7 +70,7 @@
             CodeItem.EncodedTypeAddrPair typeAddrPair = encodedCatchHandler.getHandler(i);
             Handler handler = handlers[i];
 
-            Assert.assertTrue(typeAddrPair.getTypeReferenceField().toString().compareTo(handler.type) == 0);
+            Assert.assertTrue(typeAddrPair.getTypeReferenceField().getTypeDescriptor().compareTo(handler.type) == 0);
             Assert.assertTrue(typeAddrPair.getHandlerAddress() == handler.handlerAddress);
         }
     }
