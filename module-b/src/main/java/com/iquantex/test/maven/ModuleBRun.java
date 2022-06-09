package com.iquantex.test.maven;

import com.google.common.base.Objects;
import lombok.extern.slf4j.Slf4j;

/**
 * @author quail
 */
@Slf4j
public class ModuleBRun {

    public static void run () {
        // 这个方法在 v19.0 中有，在 v26.0-jre 中没有
        log.info ("==== 开始执行 module-b 的代码 & quot;");
                Objects.ToStringHelper toStringHelper = Objects.toStringHelper (new Object ());
        toStringHelper.add ("in", "in");
        toStringHelper.add ("out", "out");
        log.info ("====[{}]", toStringHelper.toString ());
        log.info ("====module-b 的代码执行完成 & quot;");
    }
}
