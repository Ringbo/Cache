diff --git a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/ValueHostConversionTest.java b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/ValueHostConversionTest.java
index 17c067d..fea163d 100644
--- a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/ValueHostConversionTest.java
+++ b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/ValueHostConversionTest.java
@@ -381,11 +381,11 @@
         assertTrue(newInstance.asHostObject() instanceof JavaRecord);
 
         assertTrue(newInstance.hasMember("getClass"));
-        assertTrue(newInstance.getMember("getClass").newInstance().asHostObject() instanceof JavaRecord);
+        assertTrue(newInstance.getMember("getClass").execute().newInstance().asHostObject() instanceof JavaRecord);
         assertTrue(newInstance.getMetaObject().newInstance().asHostObject() instanceof JavaRecord);
         assertTrue(newInstance.getMetaObject().asHostObject() == JavaRecord.class);
 
-        assertValue(context, recordClass, Trait.INSTANTIABLE, Trait.MEMBERS);
+        assertValue(context, recordClass, Trait.INSTANTIABLE, Trait.MEMBERS, Trait.HOST_OBJECT);
     }
 
     @Test
