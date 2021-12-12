diff --git a/hsweb-system/hsweb-system-authorization/hsweb-system-authorization-starter/src/test/java/org/hswebframework/web/authorization/starter/AutoSyncPermissionTest.java b/hsweb-system/hsweb-system-authorization/hsweb-system-authorization-starter/src/test/java/org/hswebframework/web/authorization/starter/AutoSyncPermissionTest.java
index 26802d2..f1eb468 100644
--- a/hsweb-system/hsweb-system-authorization/hsweb-system-authorization-starter/src/test/java/org/hswebframework/web/authorization/starter/AutoSyncPermissionTest.java
+++ b/hsweb-system/hsweb-system-authorization/hsweb-system-authorization-starter/src/test/java/org/hswebframework/web/authorization/starter/AutoSyncPermissionTest.java
@@ -72,7 +72,7 @@
         Assert.assertEquals(permissionEntity.getName(), "测试权限");
         Assert.assertTrue(!permissionEntity.getActions().isEmpty());
 
-        Assert.assertEquals(permissionEntity.getOptionalFields().size(), 2);
+        Assert.assertEquals(permissionEntity.getOptionalFields().size(), 3);
     }
 
     @Authorize(permission = "test", description = "测试权限")
