package com.example.a.buglypatch;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by a on 2018/2/7.
 */

public class SampleApp extends TinkerApplication {
    public SampleApp() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.a.buglypatch.SampleLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
