diff --git a/src/biz/bokhorst/xprivacy/XRuntime.java b/src/biz/bokhorst/xprivacy/XRuntime.java
index cc8cbd1..0cbf1be 100644
--- a/src/biz/bokhorst/xprivacy/XRuntime.java
+++ b/src/biz/bokhorst/xprivacy/XRuntime.java
@@ -40,7 +40,7 @@
 				String command = TextUtils.join(" ", progs);
 				XUtil.log(this, Log.INFO, "exec(" + command + ")");
 				if ((mCommand == null && !command.startsWith("sh") && !command.startsWith("su"))
-						|| (command != null && command.startsWith(mCommand)))
+						|| (mCommand != null && command.startsWith(mCommand)))
 					if (isRestricted(param, mCommand == null ? getMethodName() : mCommand))
 						param.setThrowable(new IOException(XRestriction.getDefacedString()));
 			}
