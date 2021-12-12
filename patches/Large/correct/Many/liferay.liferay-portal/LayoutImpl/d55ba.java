diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
index fa80db5..f25ad76 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
@@ -684,7 +684,7 @@
 					ses.setAttribute(key, junctionPlid);
 				}
 				else {
-					ses.setAttribute(key, new Integer(0));
+					ses.setAttribute(key, new Long(0));
 				}
 			}
 
