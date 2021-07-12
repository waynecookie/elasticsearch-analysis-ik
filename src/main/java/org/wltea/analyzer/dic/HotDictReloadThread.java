package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * database词库的热更新线程
 *
 * @author wayne
 */
public class HotDictReloadThread {
    private static final Logger log = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    /**
     * 获取词典单子实例，并执行它的reLoadMainDict方法;
     */
    public void initial(){
        while (true) {
            log.info("正在调用HotDictReloadThread...");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }

}
