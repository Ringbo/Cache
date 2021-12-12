diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index eb0a582..cd574ae 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -1213,7 +1213,7 @@
         return new GLMGradientInfo(gt._likelihood, gt._likelihood * _parms._obj_reg + .5 * _l2pen * l2pen, gt._gradient);
       } else {
         assert beta.length == _dinfo.fullN() + 1;
-        assert !_parms._intercept || (beta[beta.length-1] == 0);
+        assert _parms._intercept || (beta[beta.length-1] == 0);
         GLMGradientTask gt;
         if(_parms._family == Family.binomial && _parms._link == Link.logit)
           gt = new GLMBinomialGradientTask(_jobKey,_dinfo,_parms,_l2pen, beta).doAll(_dinfo._adaptedFrame);
