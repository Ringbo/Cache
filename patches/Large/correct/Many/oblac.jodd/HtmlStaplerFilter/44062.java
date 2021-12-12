diff --git a/mod/jodd-wot/src/jodd/lagarto/htmlstapler/HtmlStaplerFilter.java b/mod/jodd-wot/src/jodd/lagarto/htmlstapler/HtmlStaplerFilter.java
index 86263a5..e7f3701 100644
--- a/mod/jodd-wot/src/jodd/lagarto/htmlstapler/HtmlStaplerFilter.java
+++ b/mod/jodd-wot/src/jodd/lagarto/htmlstapler/HtmlStaplerFilter.java
@@ -29,15 +29,8 @@
 import static jodd.lagarto.htmlstapler.HtmlStaplerBundlesManager.Strategy;
 
 /**
- * HtmlStapler filter. Parameters:
- * <li>enabled - if the whole filter is enabled or not (<code>true</code> by default)
- * <li>stripHtml - if the strip html feature is turned on (<code>true</code> by default)
- * <li>resetOnStart - if bundles should be reset on server start (<code>true</code> by default)
- * <li>useGzip - if gzip should be used (<code>false</code> by default)
- * <li>cacheMaxAge - cache header max-age value (30 days by default), if set to 0 it will not be set.
- * <li>staplerStrategy - strategy (<code>RESOURCE_ONLY</code> by default)</li>
- *
- * Some additional settings can be applied on created
+ * HtmlStapler filter.
+ * Part of the parameters are here, the other part is in the
  * {@link #createBundleManager(javax.servlet.ServletContext, jodd.lagarto.htmlstapler.HtmlStaplerBundlesManager.Strategy) bundle manager}.
  */
 public class HtmlStaplerFilter extends SimpleLagartoServletFilter {
@@ -97,7 +90,7 @@
 			String value = filterConfig.getInitParameter(parameter);
 
 			if (value != null) {
-				BeanUtil.setProperty(target, parameter, value);
+				BeanUtil.setDeclaredProperty(target, parameter, value);
 			}
 		}
 	}
