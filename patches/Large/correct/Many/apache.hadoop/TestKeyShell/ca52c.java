diff --git a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/crypto/key/TestKeyShell.java b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/crypto/key/TestKeyShell.java
index b1882a6..154579b 100644
--- a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/crypto/key/TestKeyShell.java
+++ b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/crypto/key/TestKeyShell.java
@@ -161,7 +161,7 @@
     KeyShell ks = new KeyShell();
     ks.setConf(new Configuration());
     rc = ks.run(args1);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
     assertTrue(outContent.toString().contains("key1 has not been created."));
   }
 
@@ -174,7 +174,7 @@
     KeyShell ks = new KeyShell();
     ks.setConf(new Configuration());
     rc = ks.run(args1);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
     assertTrue(outContent.toString().contains("key1 has not been created."));
   }
 
@@ -187,7 +187,7 @@
     KeyShell ks = new KeyShell();
     ks.setConf(new Configuration());
     rc = ks.run(args1);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
     assertTrue(outContent.toString().contains("There are no valid " +
     		"KeyProviders configured."));
   }
@@ -216,7 +216,7 @@
     config.set(KeyProviderFactory.KEY_PROVIDER_PATH, "user:///");
     ks.setConf(config);
     rc = ks.run(args1);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
     assertTrue(outContent.toString().contains("There are no valid " +
     		"KeyProviders configured."));
   }
@@ -262,19 +262,19 @@
     final String[] args2 = {"create", "keyattr2", "--provider", jceksProvider,
             "--attr", "=bar"};
     rc = ks.run(args2);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
 
     /* Not in attribute = value form */
     outContent.reset();
     args2[5] = "foo";
     rc = ks.run(args2);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
 
     /* No attribute or value */
     outContent.reset();
     args2[5] = "=";
     rc = ks.run(args2);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
 
     /* Legal: attribute is a, value is b=c */
     outContent.reset();
@@ -308,7 +308,7 @@
             "--attr", "foo=bar",
             "--attr", "foo=glarch"};
     rc = ks.run(args4);
-    assertEquals(-1, rc);
+    assertEquals(1, rc);
 
     /* Clean up to be a good citizen */
     deleteKey(ks, "keyattr1");
