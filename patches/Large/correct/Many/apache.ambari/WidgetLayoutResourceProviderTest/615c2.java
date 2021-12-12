diff --git a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/WidgetLayoutResourceProviderTest.java b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/WidgetLayoutResourceProviderTest.java
index 8184d34..2f05402 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/WidgetLayoutResourceProviderTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/controller/internal/WidgetLayoutResourceProviderTest.java
@@ -268,7 +268,7 @@
 
     resetToStrict(dao, widgetDAO);
     expect(dao.findById(1L)).andReturn(entity).anyTimes();
-    expect(dao.merge((WidgetLayoutEntity) anyObject())).andReturn(entity).anyTimes();
+    expect(dao.mergeWithFlush((WidgetLayoutEntity) anyObject())).andReturn(entity).anyTimes();
     expect(widgetDAO.merge(widgetEntity)).andReturn(widgetEntity).anyTimes();
     expect(widgetDAO.findById(2L)).andReturn(widgetEntity2).anyTimes();
     replay(dao, widgetDAO);
