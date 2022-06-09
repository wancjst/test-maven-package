package com.iquantex.test.maven;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

/**
 * @author quail
 */
@Slf4j
public class ModuleCRun {
    public static void main (String [] args) {
        log.info ("====Hello World!");
        ModuleBRun.run();
        run ();
    }
    public static void run () {
        log.info ("==== 开始执行 module-c 的代码 & quot;");
        // 这个方法在 v26.0-jre 中有，在 v19.0 中没有
        log.info ("====[{}]", Strings.lenientFormat("", "in", "out"));
        log.info ("====module-c 的代码执行完成 & quot;");
    }
}
