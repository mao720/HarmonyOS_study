package com.example.helloworld.slice;

import com.example.helloworld.ResourceTable;
import com.example.helloworld.SecondAbility;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        int a = 0;
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        if (button != null) {
            button.setClickedListener(component -> {
                Intent secondIntent = new Intent();
                Operation operation = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.example.helloworld")
                        .withAbilityName(SecondAbility.class)
                        .build();
                secondIntent.setOperation(operation);
                startAbility(secondIntent);
            });
        }
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
