diff --git a/xchange-dsx/src/test/java/org/knowm/xchange/dsx/DSXAdapterTest.java b/xchange-dsx/src/test/java/org/knowm/xchange/dsx/DSXAdapterTest.java
index e5f1be7..79ef922 100644
--- a/xchange-dsx/src/test/java/org/knowm/xchange/dsx/DSXAdapterTest.java
+++ b/xchange-dsx/src/test/java/org/knowm/xchange/dsx/DSXAdapterTest.java
@@ -119,7 +119,7 @@
     assertThat(lastTrade.getPrice().toString()).isEqualTo("300");
     assertThat(lastTrade.getTimestamp().getTime()).isEqualTo(142123698000L);
     assertThat(DateUtils.toUTCString(lastTrade.getTimestamp())).isEqualTo("1974-07-03 22:48:18 GMT");
-    assertThat(lastTrade.getFeeAmount()).isNull();
+    assertThat(lastTrade.getFeeAmount()).isEqualTo("0.001");
   }
 
 }
