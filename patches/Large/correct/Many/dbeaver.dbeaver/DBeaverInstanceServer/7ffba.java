diff --git a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/rpc/DBeaverInstanceServer.java b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/rpc/DBeaverInstanceServer.java
index 91094cf..cd2b015 100644
--- a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/rpc/DBeaverInstanceServer.java
+++ b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/rpc/DBeaverInstanceServer.java
@@ -124,7 +124,7 @@
                 case "autoCommit": autoCommit = CommonUtils.toBoolean(paramValue); break;
                 default:
                     if (paramName.length() > 5 && paramName.startsWith("prop.")) {
-                        paramName = paramName.substring(6);
+                        paramName = paramName.substring(5);
                         conProperties.put(paramName, paramValue);
                     }
             }
