package devsbox.discount_on.Adaptor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import devsbox.discount_on.R;

/**
 * Created by Jihan on 10-Aug-17.
 */

public class CustomAdapterRight extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] header_right;
    private final String[] address_right;
    private final String[] percent_right;

    private final Integer[] imageId_right;

    public CustomAdapterRight(Activity context, String[] header_right, String[] address_right, Integer[] imageId_right ,String[] percent_right) {

        super(context, R.layout.home_right_listview, header_right);


        this.context = context;

        this.header_right = header_right;
        this.address_right = address_right;
        this.percent_right = percent_right;
        this.imageId_right = imageId_right;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.home_left_listview, null, true);

        TextView txtHeader = (TextView) rowView.findViewById(R.id.HomeLeftHeaderListTextView);
        TextView txtAddress = (TextView) rowView.findViewById(R.id.HomeLeftAddressListTextView);
        TextView txtPercent = (TextView) rowView.findViewById(R.id.HomeLeftPercentListTextView);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.HomeLeftImageListImageView);

        txtHeader.setText(header_right[position]);
        txtAddress.setText(address_right[position]);
        txtPercent.setText(percent_right[position]);
        imageView.setImageResource(imageId_right[position]);

        return rowView;
    }
}