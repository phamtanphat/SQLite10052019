package khoapham.ptp.phamtanphat.sqlite10052019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonanAdapter extends RecyclerView.Adapter<MonanAdapter.ViewHolder> {

    ArrayList<Monan> monanArrayList;
    Context context;

    public MonanAdapter(ArrayList<Monan> monanArrayList, Context context) {
        this.monanArrayList = monanArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_monan,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Monan monan = monanArrayList.get(position);
        holder.txtTen.setText(monan.getTen());
        holder.txtGia.setText(monan.getGia() + " Đồng");
        holder.txtDiachi.setText(monan.getDiachi());
    }

    @Override
    public int getItemCount() {
        return monanArrayList!= null ? monanArrayList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTen,txtGia,txtDiachi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.textviewTen);
            txtGia = itemView.findViewById(R.id.textviewGia);
            txtDiachi = itemView.findViewById(R.id.textviewDiachi);
        }
    }
}
