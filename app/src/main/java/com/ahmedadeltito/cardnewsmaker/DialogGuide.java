package com.ahmedadeltito.cardnewsmaker.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import com.ahmedadeltito.cardnewsmaker.R;

public class DialogGuide extends Dialog {
    private Button nextButton;
    private Button preButton;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lpWindow_inf = new WindowManager.LayoutParams();
        lpWindow_inf.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow_inf.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow_inf);
        setContentView(R.layout.activity_dialog_guide);
        nextButton = (Button)findViewById(R.id.go_right);
        nextButton.setBackgroundResource(R.drawable.ic_action_next_item);
        preButton = (Button)findViewById(R.id.go_left);
        preButton.setBackgroundResource(R.drawable.ic_action_previous_item);

//        mcloseButton = (Button)findViewById(R.id.go_right);

        // 클릭 이벤트 셋팅
//        mcloseButton.setOnClickListener(mCloseClickListener);


    }

    // 클릭버튼이 하나일때 생성자 함수로 클릭이벤트를 받는다.
    public DialogGuide(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }

}
