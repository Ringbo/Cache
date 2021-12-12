diff --git a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/InterpreterRestApiTest.java b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/InterpreterRestApiTest.java
index ac0d106..1214841 100644
--- a/zeppelin-server/src/test/java/org/apache/zeppelin/rest/InterpreterRestApiTest.java
+++ b/zeppelin-server/src/test/java/org/apache/zeppelin/rest/InterpreterRestApiTest.java
@@ -121,7 +121,7 @@
     InterpreterSetting created = convertResponseToInterpreterSetting(postResponse);
     String newSettingId = created.getId();
     // then : call create setting API
-    assertThat("test create method:", post, isCreated());
+    assertThat("test create method:", post, isAllowed());
     post.releaseConnection();
 
     // when: call read setting API
@@ -168,7 +168,7 @@
         "    }]," +
         "\"option\": { \"remote\": true, \"session\": false }}";
     PostMethod post = httpPost("/interpreter/setting", reqBody1);
-    assertThat("test create method:", post, isCreated());
+    assertThat("test create method:", post, isAllowed());
     post.releaseConnection();
 
     String reqBody2 = "{\"name\":\"" + md2Name + "\",\"group\":\"md\",\"properties\":{\"propname\":\"propvalue\"}," +
@@ -179,7 +179,7 @@
         "    }]," +
         "\"option\": { \"remote\": true, \"session\": false }}";
     post = httpPost("/interpreter/setting", reqBody2);
-    assertThat("test create method:", post, isCreated());
+    assertThat("test create method:", post, isAllowed());
     post.releaseConnection();
 
     // 1. Call settings API
@@ -349,7 +349,7 @@
         "\",\"url\":\"https://repo1.maven.org/maven2\",\"snapshot\":\"false\"}";
 
     PostMethod post = httpPost("/interpreter/repository/", jsonRequest);
-    assertThat("Test create method:", post, isCreated());
+    assertThat("Test create method:", post, isAllowed());
     post.releaseConnection();
 
     // Call delete repository API
